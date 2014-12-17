corr <- function(directory, threshold=0)  {
  files_list <- list.files(directory, full.names=TRUE)   
  tab <- data.frame() #creates an empty data frame
  dat <-data.frame()
  cor <- NULL
  for (i in 1:332) {
    
    tab <- read.csv(files_list[i])
    nitsulf <- tab[c(2,3)]
    nitsulf1 <- nitsulf[complete.cases(nitsulf),]
    sulf <-nitsulf1[,1]
    nit <-nitsulf1[,2]
    comp <- complete.cases(tab)
    nobs <-sum(comp)
    
    if (nobs > threshold){
     co <- cor(sulf,nit)
     cor <- append(cor,co)
    }
    nitsulf <- data.frame()
    tab <- data.frame()
    }
    return(cor)
  
    
}