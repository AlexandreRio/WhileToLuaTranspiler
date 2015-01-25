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

function libWH.pTree(str, prof, node)
  if (node == nil) then
    str = str .. "nil"
  end
  if (node ~= nil and node.name == "leaf") then
    str = str .. "nil"
  end

  if (node ~= nil and node.name ~= "leaf") then
    str = str ..  "     ."
    if node.left ~= nil then
      indent = ""
      for i=0, prof, 1 do
        indent = indent .. "     "
      end
      str = str .. libWH.pTree("\n" .. indent, prof+1, node.left)
    end
    if node.right ~= nil then
      str = str .. libWH.pTree("   ", prof+1, node.right)
    end
  end
  return str
end

function libWH.printTree(node)
  print (libWH.pTree("", 0, node))
end

return libWH
