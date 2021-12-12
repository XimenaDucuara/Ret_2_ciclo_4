package usa.sesion1.adornos.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import usa.sesion1.adornos.Compras;
import usa.sesion1.adornos.R;
import usa.sesion1.adornos.databinding.ActivityCarroComprasBinding;
import usa.sesion1.adornos.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    public GalleryFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        Button btnOpen = (Button) view.findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Compras.class);
                in.putExtra("some", "estas comprando");
                startActivity(in);
            }
        });

        return view;
    }
    }