a = {}
b = {}
a.name = "hey"
b.left = a
print (b.left.name)
a.name = "yo"
print (b.left.name)

