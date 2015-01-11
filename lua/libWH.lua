libWH = {}

function libWH.nop()
end

function libWH.isNil(expr)
  return expr.name == nil
end

return libWH
