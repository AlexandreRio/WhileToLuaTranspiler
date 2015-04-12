describe("Test suite for the While library", function()

  setup(function()
    wh = require("libWH")
  end)

  teardown(function()
    wh = nil
  end)

  it("test one object tree",function()
    local node = wh.newLeaf()
    assert.is.not_true(wh.isNotNil(node))
  end)
end)
