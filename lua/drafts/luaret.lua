local wh = require "libWH"

function f(X)
  return X, X
end

print (f(arg[1]))
wh.printTree (f(arg[1]))
