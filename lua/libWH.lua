libWH = {}

function libWH.nop()
end

function libWH.isNil(expr)
  return expr.name == nil
end

function libWH.newLeaf()
  local leaf = {}
  leaf.name = "leaf"
  --leave sons field to nil value
  return leaf
end

function libWH.setLeaf(node, left, right)
  node.name = nil
  node.left = left
  node.right = right
end

function libWH.setLeaf(node, left)
  libWH.setLeaf(node, left, libWH.newLeaf())
end

function libWH.tree(treeName)
  local tree = {}
  tree.name  = treeName
  tree.left  = nil
  tree.right = nil
  return tree
end

function libWH.printTree(node)
  print (node.name)
  if node.left ~= nil then
    libWH.printTree(node.left)
  end
  if node.right ~= nil then
    libWH.printTree(node.right)
  end
end

return libWH
