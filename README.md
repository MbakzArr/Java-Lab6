# Star Wars Name Generator

## Description
This repository contains a Java program for generating Star Wars names based on a given input. Star Wars names are created using a specific formula involving the first three letters of the first name, the first two letters of the last name, the first two letters of the mother's maiden name, and the first three letters of the city of birth.

## Instructions
- Run the `StarWarsName` driver class.
- Provide input data separated by `|` (pipe) delimiter. The input should consist of the first name, last name, mother's maiden name, and city of birth.
- The program will then generate your Star Wars name based on the provided input.

## Formula
Star Wars first name = first 3 letters of first name + first 2 letters of last name  
Star Wars last name = first 2 letters of mother's maiden name + first 3 letters of city of birth  

## Features
- Utilizes symbolic constants instead of magic numbers for better code readability.
- Implements String methods such as `split()` and `substring()` for string manipulation.
- Displays the Star Wars name using `System.out.format()`.

## Notes
- Ensure that all letters in the generated Star Wars name, except for the first letters of each name, are displayed in lowercase.
- The program checks for proper input data and throws exceptions if the input is missing or incorrect.

## Sample Runs
- **Missing arg**:
  ```
  Exception in thread "main" java.lang.IllegalArgumentException: missing data input
  at StarWarsName.main(StarWarsName.java:26)
  ```

- **Not four Strings**:
  ```
  ERROR: incorrect number of words provided.
  ```

- **Successful run**:
  ```
  Your Star Wars name is: Brami Shchi
  ```

## Author
This program was developed by [Your Name].

## Acknowledgments
Special thanks to Jason Wilder for providing the lab exercise and inspiration for this project.
