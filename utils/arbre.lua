-- DEMO: Binary search trees in Lua
--[[
DATA DESCRIPTION:

A (bst X) is one of:
- nil
- { left = l, key = k, value = v, right = r }
where k is a string
v is an X
l and r are (bst X)

A (maybe X) is one of
- nil
- X
]]

__doc = { }

__doc.bst_search = [[function(string, bst X) -> (maybe X)
  to return the value associated with the given key in the given tree,
  or if the key does not appear in the tree, to return nil
  ]]

  function bst_search(key, tree) -- arguments separated by commas
    if tree == nil then
      return nil
    else
      if key < tree.key then
        return bst_search(key, tree.left) -- function application
      elseif key == tree.key then
        return tree.value
      elseif key > tree.key then
        return bst_search(key, tree.right)
      else
        assert(false, 'all conditions were false')
      end
    end
  end

  -------------------------------------------------------------------------------
  -- homegrown unit tests

  -- function equal(any, any) returns boolean
  -- to tell if two values are structurally identical
  local function equal(v1, v2)
    if type(v1) == 'table' and type(v2) == 'table' then
      for k, v in pairs(v1) do --  species of andmap/ormap
        -- every part of v1 is equal to the corresponding part in v2
        if not equal(v, v2[k]) then
          return false
        end
      end
      for k, v in pairs(v2) do
        -- every part of v2 has a corresponding part in v1
        if v1[k] == nil then
          return false
        end
      end
      return true
    else
      return v1 == v2
    end
  end

  local ntests = 0
  local npassed = 0
  local msgs = { } -- empty list

  local function check_expect(v1, v2)
    ntests = ntests + 1 -- mutation
    if equal(v1, v2) then
      npassed = npassed + 1 -- mutation
    else
      local info = debug.getinfo(2)
      table.insert(msgs, 'test failed: ' .. info.source .. ', line ' .. info.currentline)
      -- table.insert is a mutating form of cons
      -- the infix .. is string-append
    end
  end

  local function report_tests()
    io.stderr:write(string.format("Passed %d of %d test%s\n",
    npassed, ntests,
    ntests ~= 1 and 's' or ''))
    -- strange expression form for if-then-else
    if #msgs > 0 then
      io.stderr:write('Failures:\n')
      for _, msg in ipairs(msgs) do -- species of map, sort of...
        io.stderr:write('  ', msg, '\n')
      end
    end
  end

  ----------------------------------------------------------------------------------

  local et = nil -- empty tree
  local t1 =
  { left = { key = "Guyer", value = 5 },  -- all parts default to 'nil'
  key = "Hescott", value = 7,
  right = { key = "Ramsey", value = 8 },
}

local t2 = 
{ key = "Guyer", value = "ast", -- there are no symbols in Lua
right = {
  key = "Hescott", value = "lec",
  right = {
    key = "Ramsey", value = "asc",
  },
},
  }

  check_expect(bst_search("Guyer", et), nil)
  check_expect(bst_search("Guyer", t1), 5)
  check_expect(bst_search("Guyer", t2), "ast")
  check_expect(bst_search("Ramsey", et), nil)
  check_expect(bst_search("Ramsey", t1), 8)
  check_expect(bst_search("Ramsey", t2), "asc")
  check_expect(bst_search("Hescott", et), nil)
  check_expect(bst_search("Hescott", t1), 7)
  check_expect(bst_search("Hescott", t2), "lec")

  -----------------------------------
  __doc.bst_insert = [[function(string, X, bst X) -> maybe X
    to add the key-value pair to tree 't', replacing any existing node with
    the same key
    ]]
    function bst_insert(key, value, t)
      if t == nil then
        return { key = key, value = value } -- left and right default to nil
      else
        if key < t.key then
          return { left = bst_insert(key, value, t.left),
          key = t.key, value = t.value, right = t.right }
        elseif key == t.key then
          return { left = t.left, key = key, value = value, right = t.right }
        elseif key > t.key then
          return { left = t.left,
          key = t.key, value = t.value,
          right = bst_insert(key, value, t.right),
        }
      else
        assert(false, 'all conditions were false')
      end
    end
  end


  check_expect(bst_insert("Slonim", 5, nil), { key = "Slonim", value = 5 })
  check_expect(bst_insert("Slonim", 5, t1),
  { left = { key = "Guyer", value = 5 },
  key = "Hescott", value = 7,
  right = {
    left = nil, -- redundant, but clearer
    key = "Ramsey", value = 8,
    right = { key = "Slonim", value = 5 },
  },
})


check_expect(bst_insert("Khardon", 0, t1),
{ left = { key = "Guyer", value = 5 },
key = "Hescott", value = 7,
right = {
  left = { key = "Khardon", value = 0 },
  key = "Ramsey", value = 8,
  right = nil, -- redundant, but clearer
},
             })

             check_expect(bst_insert("Ramsey", 99, t1),
             { left = { key = "Guyer", value = 5 }, 
             key = "Hescott", value = 7,
             right = { key = "Ramsey", value = 99 },
           })





           report_tests()

