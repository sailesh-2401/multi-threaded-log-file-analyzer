Multi-Threaded Log Analyzer

A lightweight Java console application designed to analyze large log files efficiently using multithreading.

## Features
- **Concurrent Processing**: Uses multiple threads to scan logs for different severity levels (INFO, ERROR, WARNING) simultaneously.
- **Java Lambdas**: Implements clean and modern Java syntax for thread creation.
- **Resource Management**: Uses `Scanner` and `try-with-resources` for memory-efficient file handling.
- **Thread Synchronization**: Utilizes the `.join()` method to ensure accurate final counts.

## Project Structure
- `LogFileAnalyzer`: The main source code.
- `logs.txt`: The input file containing timestamped log entries.

## 🛠️ How to Run
1. Ensure you have **Java JDK 8+** installed.
2. Create a file named `logs.txt` in the project root directory.
3. Add your log data in the following format:
   `2026-03-10 INFO User logged in`
4. Compile the program:
   javac LogFileAnalyzer.java
5. Run the program:
   java EasyLogAnalyzer
   
## Another way to Run
1.Click on code, then click on codespaces
2.Navigate to src in the Muli-threaded Log File Analyzer
3.Select the LogFileAnalyzer.java file
4.Click on f5 button in keyboard / run and debug button in the left corner of the window.
5.Outputs will be displayed in the console.
