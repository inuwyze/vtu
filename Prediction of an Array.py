s=input()
input()
st=input()
num=st.split(" ")
sum=0
for x in num:
    sum+=int(x)

    
print(sum)
if(sum%2==0):
    print("\nEven Array")
else:
    print("\nOdd Array")

    
    