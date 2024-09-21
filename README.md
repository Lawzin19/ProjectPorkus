# Porkus Project 🐖

**Porkus Project** is a custom Minecraft plugin developed on the Bukkit platform. The main goal of this project is to create a **personal piglin** companion, named Porku, who follows the player and interacts with the environment. Porku will move naturally when the player walks, staying within a limited area around its summon point.

## Table of Contents

- [Main Features](#main-features)
- [Known Issues](#known-issues)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Contribution](#contribution)

## Main Features

- Summon Porku using a specific item or custom command.
- Porku follows the player naturally, moving alongside the player instead of being pulled directly.
- Porku’s movement is limited to a 5x5 block area around the summon point.
- Porku persists in the world until a special item (GoldenBrick) is used again.

## Known Issues

### Import Errors in `PorkusFollowTask.java`

Currently, the `PorkusFollowTask.java` file, which handles Porku’s following behavior, is experiencing **import issues** that prevent proper compilation. Some necessary classes are not being imported correctly, leading to build failures. 

If you encounter similar issues or know how to resolve these errors, feel free to open a pull request or report it in the Issues section.

## Technologies Used

- **Java**
- **Bukkit API** for Minecraft
- **Spigot** (for compatibility)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/projectporkus.git
