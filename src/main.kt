fun main() {
    var string: String
    var stringLength: Int
    var userinput: String

    var useSpecialCharacters: Char
    var useNumbers: Char
    var useUppercaseLetters: Char
    var useLowercaseLetters: Char

    val uppercaseLetters = "QAZWSXEDCRFVTGBYHNUJMIKOLP"
    val lowercaseLetters = "qazwsxedcrfvtgbyhnujmikolp"
        val numbers = "1234567890"
    val specialCharacters = "!@#$%^&*()_+-={}|[]:;<>?,./"

    println("JfaceChar version 1.0.0")
    println("jfacesoftware.com")
    println("for a list of commands type [help]")

    while (true) {
        print("> ")
        userinput = readLine()!!

        if (userinput == "help") {
            println("[generate] - Generates a string")
            println("[exit] - Exits the program")
        } else if (userinput == "generate") {

            print("Enter the length of the string > ")
            stringLength = readLine()!!.toInt()

            print("use special characters [y|n] > ")
            useSpecialCharacters = readLine()!!.trim().lowercase()[0]

            print("use numbers [y|n] > ")
            useNumbers = readLine()!!.trim().lowercase()[0]

            print("use uppercase letters [y|n] > ")
            useUppercaseLetters = readLine()!!.trim().lowercase()[0]

            print("use lowercase letters [y|n] > ")
            useLowercaseLetters = readLine()!!.trim().lowercase()[0]
            var stringLengthVal = stringLength
            string = ""

            while (stringLength > 0) {
                print("\r [$stringLength] remaining        ")

                if (useLowercaseLetters == 'y' && stringLength > 0) {
                    string += lowercaseLetters.random()
                    stringLength--
                    print("\r [$stringLength] remaining                                              ")
                }
                if (useUppercaseLetters == 'y' && stringLength > 0) {
                    string += uppercaseLetters.random()
                    stringLength--
                    print("\r [$stringLength] remaining                                              ")
                }
                if (useNumbers == 'y' && stringLength > 0) {
                    string += numbers.random()
                    stringLength--
                    print("\r [$stringLength] remaining                                              ")
                }
                if (useSpecialCharacters == 'y' && stringLength > 0) {
                    string += specialCharacters.random()
                    stringLength--
                    print("\r [$stringLength] remaining                                              ")
                }
                if (useUppercaseLetters != 'y' && useLowercaseLetters != 'y' && useNumbers != 'y' && useSpecialCharacters != 'y') {
                    println("\u001B[31m No characters selected")
                    println("\u001B[31m Please select at least one character")
                    println("\u001B[0m")
                    break
                }
            }

            println("\r")
            println(string)

        } else if (userinput == "exit") {
            System.exit(0)
        } else {
            println("\u001B[31m Invalid command")
            println("\u001B[31m for a list of commands type [help]")
            println("\u001B[0m")
        }
    }
}