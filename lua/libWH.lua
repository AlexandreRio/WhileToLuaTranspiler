libWH = {}

function libWH.nop()
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

function libWH.setLeaf(node, left)
  libWH.setLeaf(node, left, libWH.newLeaf())
end

function libWH.setLeaf(node, left, right)
  node.name = "cons"
  node.left = left
  node.right = right
end

function libWH.tree(treeName)
  local tree = {}
  tree.name  = treeName
  tree.left  = nil
  tree.right = nil
  return tree
end

function libWH.printTree(node)
  print ("name " .. node.name)
  if node.left ~= nil then
    libWH.printTree(node.left)
  end
  if node.right ~= nil then
    libWH.printTree(node.right)
  end
end

return libWH
