#!/bin/bash

# Accept three numbers from the user
read -p "Enter the first number: " num1
read -p "Enter the second number: " num2
read -p "Enter the third number: " num3

# Find the largest number
largest=$num1

if [ $num2 -gt $largest ]; then
    largest=$num2
fi

if [ $num3 -gt $largest ]; then
    largest=$num3
fi

# Print the result
echo "The largest number is: $largest"
