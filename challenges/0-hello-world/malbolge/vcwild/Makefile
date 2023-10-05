# /* Pretty imports */

YELLOW := $(shell tput -Txterm setaf 3)
BLUE := $(shell tput -Txterm setaf 6)
RESET := $(shell tput -Txterm sgr0)

# /* Binary settings */
NAME ?= malbolge

.PHONY: all clean fclean re install veja

# /* Rules */

all : $(NAME)

$(NAME): $(NAME).c
	@echo "$(YELLOW)[+] Compiling $(NAME)...$(RESET)"
	@gcc -o $(NAME) $(NAME).c

$(NAME).c:
	@echo "$(YELLOW)[+] Downloading $(NAME).c...$(RESET)"
	@curl -s -O https://raw.githubusercontent.com/bipinu/malbolge/master/malbolge.c -o malbolge.c


# requires root
install: $(NAME)
	@echo "$(YELLOW)[+] Installing $(NAME)...$(RESET)"
	@cp $(NAME) /usr/local/bin

clean:
	@echo "$(BLUE)[-] Cleaning $(NAME).c...$(RESET)"
	@rm -f $(NAME).c

fclean: clean
	@echo "$(BLUE)[-] Cleaning $(NAME) binary file...$(RESET)"
	@rm -f $(NAME)

# requires root
veja: fclean
	@echo "$(BLUE)[-] Removing installed $(NAME) interpreter...$(RESET)"
	@rm -f /usr/local/bin/$(NAME)
