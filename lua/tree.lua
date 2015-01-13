
-- Implementation of binary trees

-- Functional binary trees
functional_mt = {}
functional_mt.__index = functional_mt

-- Create an empty leaf
function Leaf()
  local node = {
    ["isLeaf"] = true
  }
  return setmetatable(node, functional_mt)
end

-- Create a node (given a value and left/right subtrees)
function Node(a, left, right)
  local node = {
    ["value"] = a,
    ["left"] = left,
    ["right"] = right
  }

  return setmetatable(node, functional_mt)
end

-- Insert given element by replication
function functional_mt:add(a)
  if not self.isLeaf then
    local val = self.value
    if a < val then
      return Node(val, self.left:add(a), self.right)
    else
      return Node(val, self.left, self.right:add(a))
    end
  else
    return Node(a, Leaf(), Leaf())
  end
end

-- Insert given element by mutation
function functional_mt:insert(a)
  if not self.isLeaf then
    local val = self.value
    if a < val then
      self.left:insert(a)
    else
      self.right:insert(a)
    end
  else
    self.isLeaf = nil
    self.value  = a
    self.right  = Leaf()
    self.left   = Leaf()
  end
end

-- Find given element
function functional_mt:find(a)
  if self.isLeaf then
    return nil
  else
    local val = self.value
    if a == val then
      return a
    elseif a < val then
      return self.left:find(a)
    else
      return self.right:find(a)
    end
  end
end

-- Traverse tree in-order (yield sorted sequence)
function functional_mt:inOrder()
  return coroutine.wrap(function ()
    if not self.isLeaf then
      -- Yield left part
      for e in self.left:inOrder() do coroutine.yield(e) end
      -- Yield current element
      coroutine.yield(self.value)
      -- Yield right part
      for e in self.right:inOrder() do coroutine.yield(e) end
    end
  end)
end

-- Demo
local tree = Leaf()
local t = { 7, 3, 1, 4, 10, 9, 11 }

-- Add all elements to the tree
for i, x in ipairs(t) do tree:insert(x) end

-- Demo for find
print(tree:find(9), tree:find(42))

-- Print sorted contents
print("Sorted contents: ")
for x in tree:inOrder() do print(x) end


