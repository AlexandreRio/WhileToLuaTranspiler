local wh = require "libWH"

node = wh.newLeaf()
wh.setLeaf(node, wh.newLeaf(), wh.newNode("A"))
wh.setLeaf(node.right, wh.newLeaf(), wh.newLeaf())
wh.printTree(node)
prof, node = wh.depth(0, node)
print (prof)
