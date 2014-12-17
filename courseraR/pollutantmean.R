pollutantmean <- function(directory, pollutant, id=1:332)  {
  files_list <- list.files(directory, full.names=TRUE)   #creates a list of files
  dat <- data.frame()                             #creates an empty data frame
  for (i in 1:332) {                                #loops through the files, rbinding them together 
    dat <- rbind(dat, read.csv(files_list[i]))
  }
  dat1 <- data.frame()
  for (i in id){
  dat_subset<- dat[which(dat[,"ID"]==i),]
  dat1 <-rbind(dat1,dat_subset)
  }
  if (pollutant=="nitrate"){
    mean(dat1[,"nitrate"],na.rm=TRUE)
    
  }
  else if(pollutant=="sulfate"){
     mean(dat1[,"sulfate"],na.rm=TRUE)
  }
}