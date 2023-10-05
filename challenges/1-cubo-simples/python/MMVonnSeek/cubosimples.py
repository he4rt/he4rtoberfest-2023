import pygame
from pygame.locals import *

# Inicializa o Pygame
pygame.init()

# Configura a janela
screen = pygame.display.set_mode((800, 600))
pygame.display.set_caption("Cubo Simples")

# Cores
white = (255, 255, 255)
black = (0, 0, 0)

# Define as coordenadas dos vértices do cubo
vertices = [
    (100, 100),
    (200, 100),
    (200, 200),
    (100, 200),
    (150, 50),
    (250, 50),
    (250, 150),
    (150, 150),
]

# Define as arestas do cubo
arestas = [
    (0, 1), (1, 2), (2, 3), (3, 0),
    (4, 5), (5, 6), (6, 7), (7, 4),
    (0, 4), (1, 5), (2, 6), (3, 7)
]

# Loop principal
running = True
while running:
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

    screen.fill(white)

    # Desenha as arestas do cubo
    for aresta in arestas:
        pygame.draw.line(screen, black, vertices[aresta[0]], vertices[aresta[1]], 2)

    pygame.display.flip()

# Finaliza o Pygame
pygame.quit()