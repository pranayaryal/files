tstat<-function(n1,n2,s1,s2,mu1,mu2){
  s2p =(((n1-1)*(s1^2))+((n2-1)*(s2^2)))/(n1+n2-2)
  (mu1-mu2)-0/(sqrt(((s2p^2)/n1)+((s2p^2)/n2)))
}

  
  n1<-25 ;n2<-30 ; s1 <-2.5 ; s2<-2.0 ;x1 <-0 ; x2 <-0 ; mu1<-17.5 ; mu2<-14.7 
s2p <- (((n1-1)*(s1^2))+((n2-1)*(s2^2)))/(n1+n2-2)
##t<- (x1-x2)-(mu1-mu2)/sqrt((s2p/n1)-(s2p/n2))
t<- (mu1-mu2)-0/(sqrt(((s2p^2)/n1)-((s2p^2)/n2)))

check <-function(a,b){
  if ((a+b)>(b-a)){
    print(a+b)
  }else{
    print(b-a)
  }
}
print("hello")