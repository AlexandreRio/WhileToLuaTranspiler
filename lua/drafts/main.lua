local wh = require "libWH"

function f0(X)
wh.nop()
return X
end

local nbParam = 1
local nbRead = #arg
if nbRead > nbParam then
local list = {}
for i=nbParam, nbRead do
  table.insert(list, arg[i])
end
f0( list)
else
  f0(arg[1])
end
