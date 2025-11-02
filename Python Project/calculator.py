from operations import add, subtract, multiply, divide
def main():
    print("Welcome to the Python Calculator!")
    a = 10
    b = 5
    print("Add:", add(a, b))
    print("Subtract:", subtract(a, b))
    print("Multiply:", multiply(a, b))
    print("Divide:", divide(a, b))

if __name__ == "__main__":
    main()
