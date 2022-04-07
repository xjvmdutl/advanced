package hello.advanced.trace;

import lombok.Getter;

@Getter
public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs; //시작 시간만 알면 현재시간에서 시작시간을 뺴면 얼마나 걸린지 알수 있다.
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }
}
