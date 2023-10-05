import subprocess
import PySimpleGUI as sg


def Launcher():
    line = '*'*35
    title = 'Palíndromo'.upper()
    form = sg.FlexForm(f"{line} {title} {line}")
    layout = [
        [
            sg.Text("Inserir a palavra", size=(15, 1)),
            sg.InputText(focus=True),
            sg.ReadFormButton("Inserir", bind_return_key=True),
            sg.ReadFormButton("Sair", bind_return_key=True),
        ],
        [sg.Text("Palavra", size=(40, 1))],
        [sg.Output(size=(88, 10), key="caixa_frase")],
        [sg.ReadFormButton("Verificar", bind_return_key=True)],
        [sg.Text("Resultado Final", size=(40, 1))],
        [sg.Output(size=(88, 2), key="resultado")],
    ]

    window = form.Layout(layout)
    while True:
        (button, value) = window.Read()
        if button == sg.WIN_CLOSED or "Sair" in button:
            sg.popup_auto_close("Saindo...", auto_close_duration=0.5)
            break
        elif button == "Inserir":
            frase = value[0]
            if frase:
                window["caixa_frase"].update(f"{''.join(frase)}")
            else:
                sg.popup("ERRO","Digite alguma palavra a caixa acima!")
        elif button == "Verificar":
            palavra = window['caixa_frase'].get()
            if palavra:
                if palindromo(palavra):
                    print(f"A {palavra} é PALÍNDROMO!")
                else:
                    print(f"A {palavra} NÃO é PALÍNDROMO!")
                # window["cx_palavra"].update("")
            else:
                sg.popup("ERRO", "Digite alguma palavra!")


def palindromo(palavra):
    # Esse código: 'palavra[s] for s in range(len(palavra)-1, -1, -1)' Primeiro inverte a palavra ['s', 'o', 'c', 'o', 'r', 'r', 'a', 'm']
    # Esse código: '"".join()' junta o invertido: 'socorram'
    # e por fim esse código: '== palavra' compara as duas strings e retorna TRUE ou FALSE
    return "".join(palavra[s] for s in range(len(palavra) - 1, -1, -1)) == palavra


if __name__ == '__main__':
    Launcher()
