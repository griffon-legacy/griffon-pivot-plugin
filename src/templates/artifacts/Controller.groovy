@artifact.package@import griffon.transform.Threading

class @artifact.name@ {
    def model
    def view

    @Threading(Threading.Policy.SKIP)
    def copyText = {
        view.output.text = "[COPY] ${model.input}"
    }
}
