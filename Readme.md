WhileToLuaTranspiler
===

WhileToLuaTranspiler is originaly a school project, hosted
[here](https://github.com/fleimme/comp).


WhileToLuaTranspiler aims to provide a working compiler from the While
language, specified for the project, to the well known Lua language.


The project is currently under a big refactoring to allow easy building
and testing and especially to get rid off all Eclipse dependencies.

While
--

Simple While program:

``
function demo:
read X
%if (X) then
  nop
else
  X := (cons nil nil) 
fi
%write X
``

Technical part
--

WTLT is written in Java and use [Xtext](http://www.eclipse.org/Xtext/).
