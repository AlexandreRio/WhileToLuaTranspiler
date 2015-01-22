local wh = require "libWH"

function f0(X)
local v0 = wh.newLeaf()wh.nop()
return X
end

local nbParam = 1
local nbRead = #arg
if nbRead > nbParam then
  local list = {}
  for i=nbParam, nbRead do
    table.insert(list, arg[i])
  end
  print (f0( list))
else
  print(f0(arg[1]))
end
