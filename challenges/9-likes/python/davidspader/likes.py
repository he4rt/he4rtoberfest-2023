from sys import argv

likes = argv[1:]

total_likes = len(likes)

match total_likes:
    case 0:
        print("Ninguém curtiu isso.")
    case 1:
        print(f"{likes[0]} curtiu isso.")
    case 2:
        print(f"{likes[0]} e {likes[1]} curtiram isso.")
    case 3:
        print(f"{likes[0]}, {likes[1]} e {likes[2]} curtiram isso.")
    case _:
        print(f"{likes[0]}, {likes[1]} e outras {total_likes - 2} pessoas curtiram isso")