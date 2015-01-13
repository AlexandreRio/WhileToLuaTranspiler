libWH = {}

function libWH.nop()
end

function libWH.isNil(expr)
  return expr.name == nil
end


function libWH.tree(treeName)
  local tree = {}
  tree.name  = treeName
  tree.left  = nil
  tree.right = nil
  return tree
end

return libWH
