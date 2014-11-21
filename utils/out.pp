function sSS :
read Mavariable
%nop
%write TaVariable

function fonc2 :
read Ma
%nop; nop; nop
%write T

function fonc3 :
read Ma,Ta,Notre
%T:=nil
%write T,Ta

function fonc4 :
read Ma,Ta,Notr
%Toto,Titi:=nil,nil
%write T,Ta

function fonc5 :
read Ma,Ta,Notre
%MaVariable:=(hd test)
%write T,A

function fonc5 :
read Ma,Ta,Notre
%MaVariable:=nil=?nil or (False) and not (True)
%write T,Ta

function fonc5 :
read Ma,Ta,Notre
%MaVariable:=(test) and (test)
%write T,Ta

function fonc5 :
read Ma,Ta,Notre
%MaVariable:=(test) and (test)
%write T,Ta

function testNop :
read A
%nop
%write A

function test :
read B
%nop
%write B

function testSansBoucle :
read A,B,Cwe
%B:=nil; A:=nil; nop; nop
%write A

function testWhileLC :
read A
%while True do A:=B od
%write A

function testForExprVar :
read A
%for nil do A,B,C:=D od
%write A

function testWithCondition :
read A
%if nil then nop else nop fi
%write A

function test :
read A
%while (true) or (false) do nop od
%write B

function testList :
read A
%MaVar:=(list (list nil))
%write A

function testWhile :
read A
%while True do nop od
%write A


