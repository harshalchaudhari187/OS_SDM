#!/bin/bash

# Accept Sales and Cost from the user
read -p "Enter Sales amount: " sales
read -p "Enter Cost amount: " cost

# Calculate Profit
profit=$((sales - cost))

# Subtract 10% for Taxes
taxes=$((profit * 10 / 100))

# Calculate Net Profit
net_profit=$((profit - taxes))

# Display the result
echo "Profit: $profit"
echo "Taxes (10%): $taxes"
echo "Net Profit: $net_profit"
