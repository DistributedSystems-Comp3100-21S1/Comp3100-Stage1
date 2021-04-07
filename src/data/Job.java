package data;

public class Job {
    String jobType;
    int submitTime;
    int jobId;
    int estRuntime;
    int core;
    int memory;
    int disk;

    public Job(String[] jM) {
        this(
                jM[0],
                Integer.parseInt(jM[1]),
                Integer.parseInt(jM[2]),
                Integer.parseInt(jM[3]),
                Integer.parseInt(jM[4]),
                Integer.parseInt(jM[5]),
                Integer.parseInt(jM[6])
        );

    }

    public Job(String jobType, int submitTime, int jobId, int estRuntime, int core, int memory, int disk) {
        this.jobType = jobType; // JOBN or JOBP
        this.submitTime = submitTime;
        this.jobId = jobId;
        this.estRuntime = estRuntime;
        this.core = core;
        this.memory = memory;
        this.disk = disk;
    }

    public int getJobId() {
        return jobId;
    }

    public String GET() {
        return core + " " + memory + " " + disk;
    }
}
