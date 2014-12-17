best <- function(state,outcome){
  mainfile <- read.csv("outcome-of-care-measures.csv", colClasses = "character")
  subs <- subset(mainfile,mainfile[,7]==state | mainfile[,])
  length <-nrow(mainfile)
  for (i in 1:length){
    states <- mainfile[i,7]
    if (state==states){
      
      
      
    }
      
      
      
 }
  
  
  
  
}