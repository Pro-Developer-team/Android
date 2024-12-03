// Import the ioredis library
const Redis = require('ioredis');

// Create a new Redis client
const redis = new Redis({
  host: process.env.REDIS_HOST, // Use the environment variable for Redis host
  port: process.env.REDIS_PORT, // Use the environment variable for Redis port
});

// Function to run the Redis commands
async function run() {
  try {
    // Set a value in Redis
    await redis.set('key', 'Hello, Redis!');

    // Retrieve the value from Redis
    const value = await redis.get('key');

    // Log the retrieved value
    console.log('Retrieved value from Redis:', value);

    // Optionally, you can also delete the key
    await redis.del('key');
    console.log('Key deleted from Redis.');
  } catch (error) {
    console.error('Error connecting to Redis:', error);
  } finally {
    // Close the Redis connection
    redis.disconnect();
  }
}

// Execute the run function
run();
