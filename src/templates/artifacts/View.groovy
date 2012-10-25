@artifact.package@application(title: '@griffon.project.name@', maximized: true) {
    vbox(styles: "{horizontalAlignment:'center', verticalAlignment:'center'}") {
        label('Enter some text below')
        textInput {
            textInputContentListener {
                textChanged = { source -> model.input = source.text }
            }
        }
        button('Copy text', action: copyTextAction)
        textInput(id: 'output', enabled: false)
    }
}