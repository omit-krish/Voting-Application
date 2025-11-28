package com.omitkrish.voteapp.controller;


import com.omitkrish.voteapp.DTO.VoterDTO;
import com.omitkrish.voteapp.entity.ElectionEntity;
import com.omitkrish.voteapp.repo.ElectionRepo;
import com.omitkrish.voteapp.service.ElectionService;
import com.omitkrish.voteapp.service.VotersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("voterDTO")//here save voterDTO object in sessionAttribute , it will access globally
public class VotersController {

    //dependency injection here
    @Autowired
    private VotersService votersService;

    @Autowired
    private ElectionService electionService;

    //welcome page
    @GetMapping("/")//done
    public String welcome() {
        System.out.println("inside welcome method");
        return "welcome";
    }

    @ModelAttribute("voterDTO")//done
    public VoterDTO voterDTO() {

        return new VoterDTO();
    }

    //voter page
    @GetMapping("/voter-page")//done
    public String voterPage(@ModelAttribute("voterDTO") VoterDTO voterDTO) {

        System.out.println("voterDTO details " + voterDTO);


        return "voter-page";
    }

    //submit-voter details
    @PostMapping("/submit-voter")//done
    public String submitVoter(VoterDTO voterDTO, Model model) {

        System.out.println("inside submit voter method");
        //voterData submitting...
        model.addAttribute("voterDTO", voterDTO);
        //new object created for voterDTO
        VoterDTO voterDTO1 = new VoterDTO();
        voterDTO1.setVoterName(voterDTO.getVoterName());
        voterDTO1.setAadhaarNo(null);

        votersService.saveVoterData(voterDTO1);

        return "redirect:/candidates-details";
    }

//    candidates-details

    @GetMapping("/candidates-details")//done
    public String candidateDetails(Model model) {
        List<ElectionEntity> allCandidates =
                electionService.findAllCandidates();
        System.out.println("all candidates");
        allCandidates.forEach(System.out::println);

        model.addAttribute("allCandidates", allCandidates);
        return "voting_page";
    }

//    /do-vote?candidateName=$

    @GetMapping("/do-vote")//in progress
    public String doVoteForCandidate(@RequestParam("candidateName") String candidateName, @SessionAttribute("voterDTO") VoterDTO voterDTO) {
        System.out.println("inside do vote method");
        System.out.println("voter dto " + voterDTO);
        System.out.println("voterName :" + candidateName);

        ElectionEntity electionEntity = electionService.findElectionEntityByName(candidateName);


        VoterDTO voteDTOFromDB = votersService.findByName(voterDTO.getVoterName());
        //update vote for particular candidate

        if (voteDTOFromDB.getAadhaarNo() == null) {
            //voter id coming from voteDTOFromDB
            voterDTO.setId(voteDTOFromDB.getId());
            voterDTO.setAadhaarNo(voterDTO.getAadhaarNo());

            votersService.saveVoterData(voterDTO);
            Boolean updateStatus = electionService.updateElectionEntity(electionEntity);

            if (updateStatus) {
                return "success-page";

            }
        }

        return "feedback-page";
    }

    @GetMapping("/find-result")
    public String findResult(Model model) {
        System.out.println("inside find result method");
        ElectionEntity electionEntity = electionService.findResult();
        System.out.println(electionEntity);

        model.addAttribute("resultEntity", electionEntity);
        return "result-page";
    }
}
