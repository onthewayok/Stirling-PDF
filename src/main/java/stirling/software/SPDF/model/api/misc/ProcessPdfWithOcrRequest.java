package stirling.software.SPDF.model.api.misc;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import stirling.software.SPDF.model.api.PDFFile;

@Data
@EqualsAndHashCode(callSuper=true)
public class ProcessPdfWithOcrRequest extends PDFFile {

    @Schema(description = "List of languages to use in OCR processing")
    private List<String> selectedLanguages;

    @Schema(description = "Include OCR text in a sidecar text file if set to true")
    private Boolean sidecar;

    @Schema(description = "Deskew the input file if set to true")
    private Boolean deskew;

    @Schema(description = "Clean the input file if set to true")
    private Boolean clean;

    @Schema(description = "Clean the final output if set to true")
    private Boolean cleanFinal;

    @Schema(description = "Specify the OCR type, e.g., 'skip-text', 'force-ocr', or 'Normal'", allowableValues = {"skip-text", "force-ocr", "Normal"})
    private String ocrType;

    @Schema(description = "Specify the OCR render type, either 'hocr' or 'sandwich'", allowableValues = {"hocr", "sandwich"}, defaultValue = "hocr")
    private String ocrRenderType;

    @Schema(description = "Remove images from the output PDF if set to true")
    private Boolean removeImagesAfter;
}
