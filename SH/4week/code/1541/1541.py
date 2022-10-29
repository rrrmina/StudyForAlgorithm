def main():
    formulaStrings = list(input().split('-'))
    formulaWithBrackets = formulaStrings[0]
    for i in range(1, len(formulaStrings)):
        formulaWithBrackets += '-(' + formulaStrings[i] + ')'
    print(eval(formulaWithBrackets))

if __name__ == '__main__':
    main()