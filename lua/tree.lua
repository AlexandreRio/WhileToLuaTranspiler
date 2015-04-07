local wh = require "libWH"

node = wh.newLeaf()
wh.printTree(nil)
wh.printTree(node)
wh.setLeaf(node, wh.newLeaf())
wh.printTree(node)
