package main.java.cenglisch.hiring.domain.candidate.event;

import main.java.cenglisch.hiring.domain.candidate.CandidateId;

public class CandidateRejected implements CandidateEvent{
    private final CandidateId candidateId;

    public CandidateRejected(CandidateId candidateId) {
        this.candidateId = candidateId;
    }
}