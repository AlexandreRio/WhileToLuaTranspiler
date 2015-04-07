local wh = require "libWH"

function f0()
if (truc) then
  wh.nop()
end
end

function f1()
wh.nop()
if (truc) then
  wh.nop()
else
  wh.nop()
end
wh.nop()
wh.nop()
end

function f2()
wh.nop()
end

f2()
