library("shiny")
shinyServer(
  function(input,output,session){
    
    Data = reactive({
      if (input$submit > 0) {
        df <- data.frame(x=input$x,y=input$y)
        return(list(df=df))
      }
    })
    
    output$table <- renderTable({
      if (is.null(Data())) {return()}
      print(Data()$df)
    }, 'include.rownames' = FALSE
    , 'include.colnames' = TRUE
    , 'sanitize.text.function' = function(x){x}
    )
    
  })