#!/bin/bash

# Define source and destination directories
SOURCE_DIR="$HOME/Documents"
BACKUP_DIR="$HOME/Backup"

# Create backup directory if it doesn't exist
mkdir -p "$BACKUP_DIR"

# Copy files from source to backup
cp -r "$SOURCE_DIR/"* "$BACKUP_DIR/"

echo "Backup completed from $SOURCE_DIR to $BACKUP_DIR"
