**SingleThreadMain** - a single-threaded application that performs a resource-heavy task for the JVM and generates OOM (OutOfMemory)

**MultipleThreadMain** - application with two differently named threads. Both threads executing `StringBuilder.append()` methods endlessly.

**FixedThreadPoolMain** - application running `FixedThreadPool` with 3 threads inside. Each task executes `StringBuilder.append()` methods endlessly

**SwingMain** - application with UI written in pure Swing.

Run entry points one by one using [IntelliJ Profiler](https://www.jetbrains.com/help/idea/cpu-and-allocation-profiling-basic-concepts.html) and carefully read snapshots as per https://www.jetbrains.com/help/idea/read-the-profiling-report.html



