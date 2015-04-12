libWH = {}

function libWH.nop()
end

function libWH.max(a,b)
  if (a > b) then
    return a
  else
    return b
  end
end

function libWH.isNotNil(expr)
  return expr.name ~= "leaf"
end

function libWH.newLeaf()
  local leaf = {}
  leaf.name = "leaf"
  --leave sons field to nil value
  return leaf
end

function libWH.newNode(name)
  local leaf = {}
  leaf.name = name
  return leaf
end

function libWH.setLeaf(node, left)
  libWH.setLeaf(node, left, libWH.newLeaf())
end

function libWH.setLeaf(node, left, right)
  node.name = "cons"
  node.left = left
  node.right = right
end

function libWH.depth(dep, node)
  if (node ~= nil) then
    dep = dep + 1
    leftDepth,  n = libWH.depth(dep, node.left)
    rightDepth, n = libWH.depth(dep, node.right)
    dep = libWH.max(leftDepth, rightDepth)
  end
  return dep, node
end

function libWH.jsonTree(node)
  if (node == nil) then
    str = "\"node\" : \"nil\""
  else
    str = "\"" .. node.name .. "\" : " ..
      " { \"left\" : {" .. libWH.jsonTree(node.left) ..
      "} , \"right\" : {" .. libWH.jsonTree(node.right) .."}}"
  end
  return str
end

function libWH.printTree(node)
  print ("{" .. libWH.jsonTree(node) .. "}")
end

return libWH
