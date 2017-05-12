You’re playing your favorite Role-Playing-Game, and your character has just found a room full of treasure. You have n inventory slots. Luckily, objects of the same type stack together, with the maximum size of the stack depending on the type (e.g. coins might stack to 10, diamonds to 5, armor to 1, etc.). Each stack (or partial stack) takes up 1 inventory slot. Each item has a selling value (e.g. a single diamond might be worth 10, so a stack of 5 diamonds would be worth 50). You want to maximize the total selling value of the items in your inventory.

Write a function to find the set of things to bring home that maximizes the total value.

Input:
n: The number of inventory slots
items: Array of strings, one for each item in the room
item_infos: Array of structs, one for each unique item type
struct ItemInfo {
  String name;
  int value;
  int maximum_stack_size;
}

Output:
The maximum total value

Example input

number of inventory slots: 3
items: [“diamond”, “ruby”, “armor”, “diamond”, “diamond”, “ruby”, “diamond”, “diamond”, “diamond”, “diamond”, “diamond” “armor”] (total of 8 diamonds, 2 rubies, and 2 armor)
item_infos:[
{
  name=”diamond”
  value=10
  maximum_stack_size=5
},
{
  name=”ruby”
  value=5
  maximum_stack_size=5
},
{
  name=”armor”
  value=25
  maximum_stack_size=1
}
]

Example output
105 (1 stack of 5 diamonds worth 50, 1 partial stack of 3 diamonds worth 30, 1 stack of 1 armor worth 25)