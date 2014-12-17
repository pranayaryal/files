library("shiny")    
shinyUI(
  pageWithSidebar(
    headerPanel("textInput Demo")
    ,
    sidebarPanel(width=3,
      wellPanel(
        textInput('x', "enter X value here","")
        ,
        textInput('y', "enter Y value here","")
        ,
        actionButton("submit","Submit")
      )
    )
    ,
    mainPanel(uiOutput('table'))
  ))