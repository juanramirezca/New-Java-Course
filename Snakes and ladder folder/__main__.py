from board import board

with open("README.md","r") as f:
    print(f.read())
    
while True: 
    command = input("Enter a command:")
    if command == "hello":
        hello() # type: ignore
    elif command == "q":
        exit()
    else:
        print("I did not understand this command.")
    
print(board([]))

#Add shift omnivox 
#Do relations between every file with main
