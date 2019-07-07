ad=old=inf=ms=0

n=int(input())

for y in range(n):
  x=int(input())
    
  if 0<=x<+5:
        inf+=1
  elif 5<x<=15:
        ms+=1
  elif 15<x<=35:
        ad+=1
  else :
        old+=1
                
print("Infants-{}\nMiddle School-{}\nYouth-{}\nAdult-{}".format(inf,ms,ad,old)) 

   
    