# How to proceed with building or solving a lld problem

- Identify the key components and write as many requirements about them as possible.
- what are the design challenges that you would face and how would you solve them.
- what are the design patterns that you would use.
- what is the block diagram

## Identify the key components of the LLD problem

1. **Player**: the player who makes a move, initially our system will only have a human player, 
then we can go on and add a random player(makes random valid moves) and a smart computer
player.
2. **Board**: the tic-tac-toe board on which the player will make moves, we will set it's
dimension to be 3*3, might just change in the future though.
3. **Symbol**: The symbol that a player chose, the board cell at any point might be
unoccupied, filled by X or filled by O;
4. **Position**: any position on the board.

## What are the design patterns that I will use for this

strategy design pattern for making moves.

the design patterns that i want to use for this one application right here are the following:
state design pattern - for maintaining game states.
strategy design pattern - for implementing human-player strategy and computer strategy
factory design pattern for creating players.

