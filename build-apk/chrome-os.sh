#!/bin/bash

# Update the package list and upgrade installed packages
echo "Updating the system..."
sudo apt-get update
sudo apt-get upgrade -y

echo "System update completed."
