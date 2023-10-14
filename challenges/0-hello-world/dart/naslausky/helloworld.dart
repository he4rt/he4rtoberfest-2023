class HelloWorld{
    HelloWorld(this.mensagem);
    String mensagem;

    void saudacao() {
      print(mensagem);
    }
}

main() {
    var hello = HelloWorld("Hello World!");
    hello.saudacao();
}