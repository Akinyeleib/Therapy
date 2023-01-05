N, K = input(">> ").split(' ') # 3 6
N = int(N)
K = int(K)

opened = []
for i in range(K):
		user_input = input()
	if user_input == 'CLOSEALL':
		opened = []
	else:
		click = int(user_input.split(" ")[1])
		if click < N and click > 0:
			if click not in opened:
				opened.append(click)
			else:
				opened.remove(click)
	print(len(opened))



