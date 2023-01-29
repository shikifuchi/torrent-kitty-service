package benedict.zhang.torrentkitty.datamodel.impl;

import benedict.zhang.torrentkitty.datamodel.IResponse;
import benedict.zhang.torrentkitty.datamodel.Status;
import benedict.zhang.torrentkitty.http.client.datamodel.TorrentKittyResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResponse implements IResponse {

    @JsonIgnore
    private final Status status;

    private TorrentKittyResponse torrentkittyResponse;

    private SearchResponse(Status status){
        this.status = status;
    }
    @Override
    public Status getReponseStatus() {
        return status;
    }

    public static SearchResponse createSuccessResponse(TorrentKittyResponse torrentKittyResponse){
        final var res = new SearchResponse(Status.SUCCESS);
        res.torrentkittyResponse = torrentKittyResponse;
        return res;
    }

    public static SearchResponse createFailedResponse(){
        final var res = new SearchResponse(Status.FAILED);
        return res;
    }

//    public void withHttpResponse(String httpResponse){
//        if (Objects.requireNonNull(status) == Status.SUCCESS) {
//            parse(httpResponse);
//        }
//    }
//
//    public void withException(Exception exception){
//        if (Objects.requireNonNull(status) == Status.FAILED) {
//            failed(exception);
//        }
//    }
//
//    public void parse(String httpResponse){
//
//    }
//
//    public void failed(Exception exception){
//
//    }

}
